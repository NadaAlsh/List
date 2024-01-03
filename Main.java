// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Main {
  public static void main(String[] args) {

List<String> playlist = new ArrayList<>();    
List<String> books = new ArrayList<>();    
List<String> movies = new ArrayList<>();    

playlist.add("Dance Monkey");
playlist.add("Shape of You");    
playlist.add("Shape of You");  
playlist.add("Shape of You");  
playlist.add("Shape of You");
    
books.add("The Great Gatsby");
books.add("The Great Gatsby");
books.add("The Great Gatsby");
books.add("The Great Gatsby");
books.add("The Great Gatsby");
    
movies.add("The Great Gatsby");
movies.add("The Great Gatsby");
movies.add("The Great Gatsby");
movies.add("The Great Gatsby");
movies.add("The Great Gatsby");

playlist.remove(2);

for(String songs: playlist){
  System.out.println(songs);
}




  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}