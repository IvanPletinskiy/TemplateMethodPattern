package com.handen.templateMethod

import java.io.BufferedReader
import java.io.InputStreamReader


fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    print("Input user name: ")
    val userName = reader.readLine()
    print("Input password: ")
    val password = reader.readLine()

    // Вводим сообщение.
    print("Input message: ")
    val message = reader.readLine()

    println(
        "\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter"
    )
    val choice = Integer.parseInt(reader.readLine())

    // Создаем сетевые объекты и публикуем пост.
    val network: Network = when (choice) {
        1 -> Facebook(userName, password)
        2 -> Twitter(userName, password)
        else -> throw Exception()
    }
    network.post(message)
}