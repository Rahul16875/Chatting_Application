package com.example.chattingapplication.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chattingapplication.screens.ChatListScreen
import com.example.chattingapplication.screens.LoginScreen
import com.example.chattingapplication.screens.ProfileScreen
import com.example.chattingapplication.screens.SignUpScreen
import com.example.chatapplication.screens.SingleChatScreen
import com.example.chatapplication.screens.SingleStatusScreen
import com.example.chattingapplication.ChatViewModel
import com.example.chattingapplication.screens.StatusScreen


@Composable
fun ChatNavigation(){
    val navController = rememberNavController()
    val vm = hiltViewModel<ChatViewModel>()

    NavHost(navController = navController, startDestination = ChatScreen.SignUpScreen.name ) {
        
        composable(ChatScreen.SignUpScreen.name){
            SignUpScreen(navController = navController,vm)
        }
        composable(ChatScreen.LoginScreen.name){
            LoginScreen(navController = navController,vm)
        }
        composable(ChatScreen.ChatListScreen.name){
            ChatListScreen(navController = navController,vm)
        }
        composable(ChatScreen.SingleChatScreen.name){
            SingleChatScreen(navController = navController)
        }
        composable(ChatScreen.SingleStatusScreen.name){
            SingleStatusScreen(navController = navController)
        }
        composable(ChatScreen.StatusScreen.name){

            StatusScreen(navController = navController,vm)
        }
        composable(ChatScreen.ProfileScreen.name){
            val homeViewModel = hiltViewModel<ChatViewModel>()
            ProfileScreen(navController = navController,homeViewModel)
        }
    }
}