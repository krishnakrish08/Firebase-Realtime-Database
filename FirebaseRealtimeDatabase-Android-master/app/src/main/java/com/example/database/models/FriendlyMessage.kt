package com.example.database.models

class FriendlyMessage {

    var text: String? = null
    var username: String? = null

    constructor(text: String?, username: String?) {
        this.text = text
        this.username = username
    }
}