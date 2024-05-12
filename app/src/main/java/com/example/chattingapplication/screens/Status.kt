package com.example.chattingapplication.screens

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.chattingapplication.ChatViewModel
import com.example.chattingapplication.screens.BottomNavigationItem
import com.example.chattingapplication.screens.BottomNavigationMenu

@Composable
fun StatusScreen(navController: NavController,
                 vm: ChatViewModel
){
    Scaffold (bottomBar =
    {
        BottomNavigationMenu(
        selectedItem = BottomNavigationItem.STATUS_LIST,
        navController = navController
//        modifier = Modifier.padding(8.dp)
    )
    }){ it ->
        Text(text = "Status")
    }

}
