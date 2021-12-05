package com.gmind.edudash

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gmind.edudash.databinding.TableListItemBinding

@Suppress("DEPRECATION")
class PolaDietDashAdapter(private val polaDietDashTableItem: ArrayList<PolaDietDash>):
    RecyclerView.Adapter<PolaDietDashAdapter.TableViewHolder>() {

    inner class TableViewHolder(itemView: TableListItemBinding): RecyclerView.ViewHolder(itemView.root) {

        private val binding = itemView



        fun bind(polaDietDash: PolaDietDash) {
            with(binding){
                if (position == 0){
                    column1.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column1.text = polaDietDash.column1
                    column1.textSize = 24F
                    column1.typeface = Typeface.DEFAULT_BOLD

                    column2.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column2.text = polaDietDash.column2
                    column2.textSize = 24F
                    column2.typeface = Typeface.DEFAULT_BOLD


                } else
                    column1.text = polaDietDash.column1
                column2.text = polaDietDash.column2

//                Log.e("dd", itemCount.toString())
//                Log.e("dd", polaDietDashTableItem.size.toString())
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TableViewHolder {
        return TableViewHolder(TableListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        holder.bind(polaDietDashTableItem[position])
        val po = position
        Log.e("dd", position.toString())


    }

    override fun getItemCount(): Int = polaDietDashTableItem.size
}