package exercism.foodChain

import scala.annotation.tailrec

object FoodChain {
  private val animalAndLyricsMap: Map[Int, String] = Map(
    1 -> Lyrics.flySong ,
    2 -> Lyrics.spiderSong ,
    3 -> Lyrics.birdSong ,
    4 -> Lyrics.catSong ,
    5 -> Lyrics.dogSong ,
    6 -> Lyrics.goatSong ,
    7 -> Lyrics.cowSong ,
    8 -> Lyrics.horseSong ,
  )

  def recite(startIndex:Int, endIndex:Int):String ={
    @tailrec
    def createResult(start:Int, end:Int, acc:String):String = {
      if(start > end )  acc
      else createResult(start+1, end, acc + animalAndLyricsMap.getOrElse(start, "Cannot find the value")+ "\n" )
    }
    createResult(startIndex, endIndex,  "")
  }
}
