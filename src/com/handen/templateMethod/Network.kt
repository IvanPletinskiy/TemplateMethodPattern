package com.handen.templateMethod

abstract class Network(val userName: String, val password: String) {

    fun post(message: String): Boolean {
        if (logIn(this.userName, this.password)) {
            val result = sendData(message.toByteArray())
            logOut()
            return result
        }
        return false
    }

    abstract fun logIn(username: String, password: String): Boolean
    abstract fun sendData(data: ByteArray): Boolean
    abstract fun logOut()
}