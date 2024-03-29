import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

enum class TransactionType {
    INCOME, EXPENSE
}

@Composable
fun AddTransactionScreen(navController: NavController) {
    var transactionName by remember { mutableStateOf("") }
    var transactionAmount by remember { mutableStateOf("") }
    var transactionType by remember { mutableStateOf(TransactionType.INCOME) }
    var dropdownExpanded by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        TextField(
            value = transactionName,
            onValueChange = { transactionName = it },
            label = { Text("Title") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        TextField(
            value = transactionAmount,
            onValueChange = { transactionAmount = it },
            label = { Text("Amount") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(16.dp))
        Box {
            TextButton(onClick = { dropdownExpanded = true }) {
                Text("Select Transaction Type: ${transactionType.name}")
            }
            DropdownMenu(
                expanded = dropdownExpanded,
                onDismissRequest = { dropdownExpanded = false }
            ) {

            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("main")
        }) {
            Text("Save Transaction")
        }
    }
}

@Preview
@Composable
fun PreviewAddTransactionScreen() {
    AddTransactionScreen(navController = rememberNavController())
}
