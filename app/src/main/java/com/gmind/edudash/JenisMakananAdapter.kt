package com.gmind.edudash

import android.graphics.Typeface
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gmind.edudash.databinding.TableListItem2Binding
import com.gmind.edudash.databinding.TableListItem3Binding

@Suppress("DEPRECATION")
class JenisMakananAdapter(private val jenisMakananTableItem: ArrayList<JenisMakanan>):
    RecyclerView.Adapter<JenisMakananAdapter.TableViewHolder>() {

    inner class TableViewHolder(itemView: TableListItem3Binding): RecyclerView.ViewHolder(itemView.root) {

        private val binding = itemView



        fun bind(jenisMakanan: JenisMakanan) {
            with(binding){
                if (position == 0){
                    column1.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column1.text = jenisMakanan.column1
                    column1.textSize = 24F
                    column1.typeface = Typeface.DEFAULT_BOLD

                    column2.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column2.text = jenisMakanan.column2
                    column2.textSize = 24F
                    column2.typeface = Typeface.DEFAULT_BOLD

                    column3.setBackgroundResource(R.drawable.table_header_cell_bg)
                    column3.text = jenisMakanan.column3
                    column3.textSize = 24F
                    column3.typeface = Typeface.DEFAULT_BOLD



                } else
                    column1.text = jenisMakanan.column1
                column2.text = jenisMakanan.column2
                column3.text = jenisMakanan.column3

//                Log.e("dd", itemCount.toString())
//                Log.e("dd", polaDietDashTableItem.size.toString())
            }
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TableViewHolder {
        return TableViewHolder(TableListItem3Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        holder.bind(jenisMakananTableItem[position])
        val po = position
        Log.e("dd", position.toString())


    }

    override fun getItemCount(): Int = jenisMakananTableItem.size
}