package com.example.midlabexam
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun OverviewScreen(navController: NavController) {
    val totalIncome = 1500.0
    val totalExpenses = 1000.0
    val netSavings = totalIncome - totalExpenses
    val lastIncome = 500.0
    val lastExpense = 300.0

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text("Overview Screen")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Total Income: $totalIncome")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Total Expenses: $totalExpenses")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Net Savings: $netSavings")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Last Income: $lastIncome")
        Spacer(modifier = Modifier.height(8.dp))
        Text("Last Expense: $lastExpense")
    }
}

@Preview
@Composable
fun PreviewOverviewScreen() {
    OverviewScreen(navController = rememberNavController())
}
