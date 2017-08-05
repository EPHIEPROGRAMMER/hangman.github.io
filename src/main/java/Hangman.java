public class Hangman{

 public String[] listOfWords= {"pan","can","bin","cob","sly","try","fry","bry" } ;

 Integer stringNumberInArray= 0;

 public boolean HangmanLetterToBeChecked(String character){
   String WordToBeChecked =  listOfWords[stringNumberInArray];
    if(WordToBeChecked.contains(character)){
      return true;
    }else{
      return false;
    }
  }

  public Integer IndexOfLetter(String character){
      String WordToBeChecked =  listOfWords[stringNumberInArray];
      Integer indexOfTheWordToBeChecked = WordToBeChecked.indexOf(character);
      return indexOfTheWordToBeChecked;
    }


}
