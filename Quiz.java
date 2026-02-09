public static String scrambleWord(String word){
  /* To be implemented in part (a) */
  String newWord = "";
  for(int x = 0; x <= word.length()-1; x++)
  {
    new Random y = (Math.Random())*word.length()-1;
    newWord += word.substring(y, 1);
    word = word.substring(y, 1)
  }

return newWord;
}


public static void scrambleOrRemove(List<String> wordList){
  /* To be implemented in part (b) */
  for(int x = wordList.size()-1; x >= 0; x--)
  {
    if(wordList.get(x).equals(wordList.get(x).scrambleWord()))
    {
      wordList.remove(x);
    }
    wordList.get(x).scrambleWord();
  }
}
