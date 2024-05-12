package com.example.chattingapplication.navigation

import java.lang.IllegalArgumentException

enum class ChatScreen {
    SignUpScreen,
    LoginScreen,
    ChatsScreen,
    ProfileScreen,
    ChatListScreen,
    StatusScreen,
    SingleChatScreen,
    SingleStatusScreen;

    companion object {
        fun fromRoute(route: String?): ChatScreen
                = when(route?.substringBefore("/")){
            SignUpScreen.name -> SignUpScreen
            LoginScreen.name -> LoginScreen
            ChatsScreen.name -> ChatsScreen
            ProfileScreen.name -> ProfileScreen
            ChatListScreen.name -> ChatListScreen

            else -> throw IllegalArgumentException("Route $route is not recognized")

        }
    }
}