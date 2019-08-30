import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
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
 * Where the input files are .in or .txt files with one term per line, like so:
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
    // Get files
    Scanner wordsFile = openFile(args[0]);
    Scanner symbolsFile = openFile(args[1]);
    Scanner pokemonNamesFile = openFile(args[2]);
    List<String> words = readFile(wordsFile);
    List<String> symbols = readFile(symbolsFile);
    List<String> pokemonNames = readFile(pokemonNamesFile);
  }

  /**
   * Creates input file Scanner using input fileName
   *
   * @param fileName the name of the file to open.
   *
   * @return file – a Scanner containing the input file.
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

  /**
   * Reads through input file and returns each line as String in a List of Strings.
   *
   * @param inputFile the name of the file to open.
   *
   * @return lines – a List of Strings containing each of the lines of the file.
   */
  private static List<String> readFile(Scanner inputFile) {
    List<String> lines = new ArrayList<>();
    String line;
    while (inputFile.hasNext()) {
      // Get line and clean it
      line = inputFile.nextLine();
      line = line.replaceAll("\\s","");
      // Add to collection
      lines.add(line);
    }
    inputFile.close();
    return lines;
  }
}