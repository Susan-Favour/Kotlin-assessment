package com.example.assessment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionsAdapter(var expensesList: List<Wallet>):
    RecyclerView.Adapter<TransactionsAdapterHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionsAdapterHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.transaction_list_wallet, parent,false)
        return TransactionsAdapterHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionsAdapterHolder, position: Int) {
        val expense = expensesList[position]
        holder.tvSalary.text = expense.text
        holder.tvSalaryAmount.text = expense.amount
        holder.tvSalaryDate.text = expense.date
        holder.ivSalary.text = expense.image

    }

    override fun getItemCount(): Int {
        return expensesList.size
    }
}

class TransactionsAdapterHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
    val tvSalary = itemView.findViewById<TextView>(R.id.tvSalary)
    val tvSalaryAmount = itemView.findViewById<TextView>(R.id.tvSalaryAmount)
    val tvSalaryDate = itemView.findViewById<TextView>(R.id.tvSalaryDate)
    val ivSalary = itemView.findViewById<TextView>(R.id.ivSalary)
}