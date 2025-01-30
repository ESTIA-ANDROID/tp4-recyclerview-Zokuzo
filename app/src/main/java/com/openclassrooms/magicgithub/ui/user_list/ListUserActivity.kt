package com.openclassrooms.magicgithub.ui.user_list

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.openclassrooms.magicgithub.R
import com.openclassrooms.magicgithub.di.Injection.getRepository
import com.openclassrooms.magicgithub.model.User
import java.util.Collections

class ListUserActivity : AppCompatActivity(), UserListAdapter.Listener {
    // FOR DESIGN ---
    lateinit var recyclerView: RecyclerView
    lateinit var fab: FloatingActionButton

    // FOR DATA ---
    private lateinit var adapter: UserListAdapter

    // OVERRIDE ---
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_user)
        configureFab()
        configureRecyclerView()
    }

    override fun onResume() {
        super.onResume()
        loadData()
    }

    // CONFIGURATION ---
    private fun configureRecyclerView() {
        recyclerView = findViewById(R.id.activity_list_user_rv)
        adapter = UserListAdapter(this)
        recyclerView.adapter = adapter

        val itemTouchHelper = ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                val fromPosition = viewHolder.adapterPosition
                val toPosition = target.adapterPosition

                // Mise à jour de la liste dans le repository
                getRepository().moveUser(fromPosition, toPosition)

                // Mise à jour de l'affichage
                adapter.notifyItemMoved(fromPosition, toPosition)
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                val user = adapter.getUserAt(position)

                // Toggle de l'état actif/inactif
                getRepository().toggleUserActiveState(user)
                adapter.notifyItemChanged(position)

                // Affichage du toast
                Toast.makeText(
                    this@ListUserActivity,
                    "User ${if (user.isActive) "Activated" else "Deactivated"}",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        itemTouchHelper.attachToRecyclerView(recyclerView)
    }


    private fun configureFab() {
        fab = findViewById(R.id.activity_list_user_fab)
        fab.setOnClickListener(View.OnClickListener { view: View? ->
            getRepository().addRandomUser()
            loadData()
        })
    }

    private fun loadData() {
        adapter.updateList(getRepository().getUsers())
    }

    // ACTIONS ---
    override fun onClickDelete(user: User) {
        Log.d(ListUserActivity::class.java.name, "User tries to delete a item.")
        getRepository().deleteUser(user)
        loadData()
    }

    //Gestion de l'ordonnancement des éléments de la liste en autorisant le déplacement des cellules.


}