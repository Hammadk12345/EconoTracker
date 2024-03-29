import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.midlabexam.MainScreen
import com.example.midlabexam.OverviewScreen
import com.example.midlabexam.SplashScreen







@Composable
fun EconoTrackerApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("main") { MainScreen(navController) }
        composable("addTransaction") { AddTransactionScreen(navController) }
        composable("overview") { OverviewScreen(navController) }
    }
}

@Preview
@Composable
fun PreviewEconoTrackerApp() {
    val navController = rememberNavController()
    SplashScreen(navController)
}

