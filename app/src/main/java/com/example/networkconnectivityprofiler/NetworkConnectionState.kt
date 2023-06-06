package com.example.networkconnectivityprofiler

sealed interface NetworkConnectionState {
    object Available : NetworkConnectionState
    object Unavailable : NetworkConnectionState
}