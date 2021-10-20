package com.sigma.civgame

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.SurfaceView
import com.sigma.civgame.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(R.layout.activity_main)

        //var aPiece = Piece("Rook", Piece.TYPE_ROOK, Piece.COLOR_BLACK)
        var aBoard = Board()

        var selectedPiece = aBoard.GetPieceByPos(PointF(1f, 1f))
        
        if(!selectedPiece.IsEmpty())
        {
            var freePositions = aBoard.GetFreePositions(selectedPiece.MovementPattern)
            //then draw the positions!
        }

        aBoard.Draw()

        if (binding.SVGAME.holder.surface.isValid)
        {
            var canvas = binding.SVGAME.holder.lockCanvas()
            var img = BitmapFactory.decodeResource(resources, R.drawable.hjm_crystal_game_pieces_all)
            img = Bitmap.createScaledBitmap(img, 100, 100, false)

        }

    }
}