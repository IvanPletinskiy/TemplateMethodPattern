package com.handen.templateMethod

class Facebook(userName: String, password: String): Network(userName, password) {
    override fun logIn(username: String, password: String): Boolean {
        println("\nChecking user's parameters")
        println("Name: " + this.userName)
        print("Password: ")
        for (i in 0 until this.password.length) {
            print("*")
        }
        simulateNetworkLatency()
        println("\n\nLogIn success on Facebook")
        return true
    }

    override fun sendData(data: ByteArray): Boolean {
        val messagePosted = true
        if (messagePosted) {
            println("Message: '" + String(data) + "' was posted on Facebook")
            return true
        } else {
            return false
        }
    }

    override fun logOut() {
        System.out.println("User: '$userName' was logged out from Facebook");
    }

    private fun simulateNetworkLatency() {
        try {
            var i = 0
            println()
            while (i < 10) {
                print(".")
                Thread.sleep(500)
                i++
            }
        } catch (ex: InterruptedException) {
            ex.printStackTrace()
        }

    }
}