package exercism.RNATransciption

import scala.annotation.tailrec

/**
 * Problem Description:
 * Introduction
 * You work for a bioengineering company that specializes in developing therapeutic solutions.
 *
 * Your team has just been given a new project to develop a targeted therapy for a rare type of cancer.
 *
 * Note
 * It's all very complicated, but the basic idea is that sometimes people's bodies produce too much of a given protein. That can cause all sorts of havoc.
 *
 * But if you can create a very specific molecule (called a micro-RNA), it can prevent the protein from being produced.
 *
 * This technique is called RNA Interference.
 *
 * Instructions
 * Your task is determine the RNA complement of a given DNA sequence.
 *
 * Both DNA and RNA strands are a sequence of nucleotides.
 *
 * The four nucleotides found in DNA are adenine (A), cytosine (C), guanine (G) and thymine (T).
 *
 * The four nucleotides found in RNA are adenine (A), cytosine (C), guanine (G) and uracil (U).
 *
 * Given a DNA strand, its transcribed RNA strand is formed by replacing each nucleotide with its complement:
 *
 * G -> C
 * C -> G
 * T -> A
 * A -> U
 */
object RnaTranscription {

  private val dnaRnaTranscription: Map[Char, Char] = Map(
    'G' -> 'C',
    'C' -> 'G',
    'T' -> 'A',
    'A' -> 'U',
  )

  def toRna(dna: String): Option[String] = {
    val transcribedRna = matchRnaWithDna(dna.toList, "")
    transcribedRna match {
      case value if value.isEmpty => None
      case _ => Some(transcribedRna)
    }
  }

  @tailrec
  private def matchRnaWithDna(dna: List[Char], result: String): String = {
    dna match {
      case Nil => result
      case head :: tail => matchRnaWithDna(tail, result + RnaTranscription.dnaRnaTranscription.get(head))
    }
  }
}

