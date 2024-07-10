package com.example.assessment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        displayExpenses()

    }

    fun displayExpenses(){
        val expense1 = Wallet("","Salary","2 July 2024","KES 17400")
        val expense2 = Wallet("","Salary","3 July 2024","KES 42000")
        val expense3 = Wallet("","Salary","4 July 2024","KES 87400")
        val expense4 = Wallet("","Salary","5 July 2024","KES 52000")
        val expense5 = Wallet("","Salary","6 July 2024","KES 59000")
        val expense6 = Wallet("","Salary","7 July 2024","KES 32000")
        val expense7 = Wallet("","Salary","8 July 2024","KES 29000")


        val expenseList = listOf(expense1,expense2,expense3, expense4,expense5, expense6,expense7)
        val transactionsAdapter = TransactionsAdapter(expenseList)
        binding.recyclerView.adapter = transactionsAdapter
    }

}
