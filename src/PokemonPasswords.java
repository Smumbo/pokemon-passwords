import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * AUTHOR: Jonah Venglarcik
 * FILE: PokemonPasswords.java
 * PURPOSE: Password generator that uses adjectives, symbols, Pokémon names, and numbers to make
 * memorable passwords not solely based on dictionary terms. Uses a few configurable input files.
 *
 * USAGE:
 * inputWords inputSymbols inputPokemonNames
 *
 * Where the input files are .txt files with one term per line, like so:
 * ------------------ infile ------------------
 * ...
 * Chansey
 * Tangela
 * Kangaskhan
 * Horsea
 * Seadra
 * Goldeen
 * Seaking
 * Staryu
 * Starmie
 * Mr. Mime
 * ...
 * --------------------------------------------
 */
public class PokemonPasswords {
  public static void main(String[] args) {
    Scanner pokemonNames = openFile(args[2]);
    // test comment
  }

  /**
   * Purpose: Creates input file Scanner using input fileName
   *
   * @param fileName
   *            is the name of the file to open.
   *
   * @return file
   *         is the Scanner containing the input file.
   *
   */
  private static Scanner openFile(String fileName) {
    Scanner file = null;
    try {
      file = new Scanner(new File(fileName));
    } catch (FileNotFoundException error) {
      error.printStackTrace();
    }
    return file;
  }
}