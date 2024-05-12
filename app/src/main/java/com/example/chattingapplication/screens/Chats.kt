package com.example.chattingapplication.screens

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.chattingapplication.ChatViewModel

@Composable
fun ChatListScreen(navController: NavController,
                   vm: ChatViewModel
){
    Scaffold (bottomBar =
    { BottomNavigationMenu(
        selectedItem = BottomNavigationItem.CHAT_LIST,
        navController = navController
//        modifier = Modifier.padding(bottom = 10.dp)
    )
    }){ it->
        Text(text = "Chat Screen")
    }
//    BottomNavigationMenu(selectedItem =BottomNavigationItem.CHAT_LIST, navController =navController)
}