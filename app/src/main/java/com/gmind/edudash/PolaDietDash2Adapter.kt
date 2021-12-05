package com.gmind.edudash

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gmind.edudash.databinding.TableListItem2Binding

@Suppress("DEPRECATION")
class PolaDietDash2Adapter(private val polaDietDash2TableItem: ArrayList<PolaDietDash2>):
    RecyclerView.Adapter<PolaDietDash2Adapter.TableViewHolder>() {

    inner class TableViewHolder(itemView: TableListItem2Binding): RecyclerView.ViewHolder(itemView.root) {

        private val binding = itemView



        fun bind(polaDietDash2: PolaDietDash2) {
            with(binding){
                if (position == 0){
                    column1.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column1.text = polaDietDash2.column1
                    column1.textSize = 24F
                    column1.typeface = Typeface.DEFAULT_BOLD

                    column2.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column2.text = polaDietDash2.column2
                    column2.textSize = 24F
                    column2.typeface = Typeface.DEFAULT_BOLD

                    column3.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column3.text = polaDietDash2.column3
                    column3.textSize = 24F
                    column3.typeface = Typeface.DEFAULT_BOLD

                    column4.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column4.text = polaDietDash2.column4
                    column4.textSize = 24F
                    column4.typeface = Typeface.DEFAULT_BOLD

                } else
                    column1.text = polaDietDash2.column1
                column2.text = polaDietDash2.column2
                column3.text = polaDietDash2.column3
                column4.text = polaDietDash2.column4

//                Log.e("dd", itemCount.toString())
//                Log.e("dd", polaDietDashTableItem.size.toString())
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TableViewHolder {
        return TableViewHolder(TableListItem2Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        holder.bind(polaDietDash2TableItem[position])
        val po = position
        Log.e("dd", position.toString())


    }

    override fun getItemCount(): Int = polaDietDash2TableItem.size
}