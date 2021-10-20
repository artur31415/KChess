package com.sigma.civgame

class Piece () {
    var Name = String()
    var Key = String()
    
    var Pos = PointF(0f, 0f)
    var Type = -1
    var Color = -1

    var IsAlive = false
    var IsSelected = false

    var MovementPattern = ArrayList<PointF> ()

    constructor(name: String, type: Int, color: Int) 
    {
        Name = name
        Key = " " //This should be a random string
        Type = type
        Color = color

        IsAlive = true
    }

    fun Draw()
    {
        //TODO: DRAW THE PIECE HERE!
    }

    fun IsEmpty()
    {
        if(Name == "Empty")
            return true
        else
            return false
    }


    companion object 
    {
        const val TYPE_ROOK = 0


        const val COLOR_WHITE = 0
        const val COLOR_BLACK = 


        fun GetEmptyPiece()
        {
            return Piece("EMPTY", -1, -1)
        }
    }
}