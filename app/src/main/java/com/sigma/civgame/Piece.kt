package com.sigma.civgame

class Piece () {
    var Name = String by Delegates.notNull()
    var Key = String by Delegates.notNull()
    
    var Pos = Array (8) { Array(8) {0}}
    var Type = Int by Delegates.notNull()
    Var Color = Int by Delegates.notNull()

    constructor(name: String, type: Int, color: Int) 
    {
        Name = name
        Key = " " //This should be a random string
        Type = type
        Color = color
    }


    companion object 
    {
        const val TYPE_ROOK = 0


        const val COLOR_WHITE = 0
        const val COLOR_BLACK = 1
    }
}