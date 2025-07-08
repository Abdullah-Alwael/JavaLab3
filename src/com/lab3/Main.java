package com.lab3;
// deadline 8AM, make clear tests
// check all set methods for input validation
public class Main {
    public static void main(String[] args) {
        // create initial 5 users who have bought and reviewed everything from the store:
        // test all methods

        User u1 = new User("Abdullah.Fahad", "abdullah@company.com");
        User u2 = new User("Ahmed.Hamed", "ahmed@company.com");
        User u3 = new User("Ali.Yasser", "ali@company.com");
        User u4 = new User("Mohammed.Raed", "mohammed@company.com");
        User u5 = new User("Rashid.Mohammed", "rashid@company.com");

        // create 5 books: with a list of 5 initial reviews
        // assuming rating can range from 0 to 5

        // create a list of 5 reviews {Ai generated with some fictional data (not the code, only the input data)}
        Review r1 = new Review(u1.getUserName(), 5, "A truly transformative read. This book changed my perspective on life and pursuing dreams. Simple yet profound.");
        Review r2 = new Review(u2.getUserName(), 4, "Beautifully written fable that inspires. While some parts felt a bit simplistic, the overall message is powerful.");
        Review r3 = new Review(u3.getUserName(), 3, "An interesting allegorical tale. It's a quick read, but I found the philosophical elements a bit too on-the-nose at times.");
        Review r4 = new Review(u4.getUserName(), 2, "Overrated. The story is predictable, and the 'wisdom' feels more like platitudes. Didn't resonate with me.");
        Review r5 = new Review(u5.getUserName(), 5, "Every time I read this book, I discover something new. It's a timeless classic that motivates you to follow your heart.");

        // add the reviews to the book
        Book b1 = new Book("The Alchemist","Paulo Coelho","978-0061122415",16.99*3.75,25);
        b1.addReview(r1);
        b1.addReview(r2);
        b1.addReview(r3);
        b1.addReview(r4);
        b1.addReview(r5);

        r1 = new Review(u1.getUserName(), 5, "This book is a game-changer! Practical, actionable advice that genuinely helps you understand and implement habits. Highly recommend.");
        r2 = new Review(u2.getUserName(), 4, "Excellent guide to habit formation. Clear provides great frameworks, though some concepts might feel familiar if you've read other self-help books.");
        r3 = new Review(u3.getUserName(), 3, "Decent information on habits, but I found it a bit repetitive in places. The core ideas are solid, but could have been more concise.");
        r4 = new Review(u4.getUserName(), 5, "The best book on habits I've ever read. It breaks down complex ideas into simple, digestible steps. My productivity has soared!");
        r5 = new Review(u5.getUserName(), 2, "While the principles are good, it feels like common sense repackaged. Not as groundbreaking as I expected.");

        // add the reviews to the book
        Book b2 = new Book("Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones","James Clear","978-0735211292",17.99*3.75,30);
        b2.addReview(r1);
        b2.addReview(r2);
        b2.addReview(r3);
        b2.addReview(r4);
        b2.addReview(r5);


        r1 = new Review(u1.getUserName(), 5, "Absolutely captivating! Evelyn Hugo is an unforgettable character, and her story is full of glamour, heartbreak, and unexpected twists.");
        r2 = new Review(u2.getUserName(), 4, "A brilliant read with a compelling protagonist. The storytelling is fantastic, though the ending felt a little rushed.");
        r3 = new Review(u3.getUserName(), 3, "Enjoyed the premise and the Hollywood setting, but some of the relationships felt underdeveloped. A solid beach read.");
        r4 = new Review(u4.getUserName(), 5, "I devoured this book in one sitting! Taylor Jenkins Reid weaves a masterful tale that is both entertaining and deeply emotional.");
        r5 = new Review(u5.getUserName(), 2, "Found it difficult to connect with the characters. The constant jumping between timelines was a bit jarring and pulled me out of the story.");

        // add the reviews to the book
        Book b3 = new Book("The Seven Husbands of Evelyn Hugo","Taylor Jenkins Reid","978-1501161933",17*3.75,25);
        b3.addReview(r1);
        b3.addReview(r2);
        b3.addReview(r3);
        b3.addReview(r4);
        b3.addReview(r5);


        r1 = new Review(u1.getUserName(), 5, "A timeless masterpiece. The themes of justice, prejudice, and empathy are as relevant today as they were when it was written. A must-read for everyone.");
        r2 = new Review(u2.getUserName(), 4, "A powerful and important book. The narrative from Scout's perspective is brilliant, though the pacing can be slow at times.");
        r3 = new Review(u3.getUserName(), 3, "While a classic, I found some of the social commentary dated. Still, it's a significant work of American literature.");
        r4 = new Review(u4.getUserName(), 5, "This book shaped my understanding of the world. Atticus Finch is a hero for the ages, and the story is profoundly moving.");
        r5 = new Review(u5.getUserName(), 2, "Required reading, but I struggled to get into it. The prose felt a bit dense, and the plot didn't grip me.");

        // add the reviews to the book
        Book b4 = new Book("To Kill a Mockingbird","Harper Lee","978-0060935467",16.99*3.75,40);
        b4.addReview(r1);
        b4.addReview(r2);
        b4.addReview(r3);
        b4.addReview(r4);
        b4.addReview(r5);


        r1 = new Review(u1.getUserName(), 5, "Absolutely incredible! A thrilling, funny, and scientifically brilliant adventure. Ryland Grace is one of the most endearing protagonists ever.");
        r2 = new Review(u2.getUserName(), 4, "Andy Weir delivers again! The science is fascinating, and the story is a rollercoaster. A fantastic read for sci-fi fans, though some parts might be a bit too technical for casual readers.");
        r3 = new Review(u3.getUserName(), 3, "Entertaining, but not as good as 'The Martian'. The plot felt a little drawn out in the middle, and some of the humor didn't land for me.");
        r4 = new Review(u4.getUserName(), 5, "Pure joy from start to finish. The creativity and problem-solving are astounding, and the emotional core is surprisingly strong.");
        r5 = new Review(u5.getUserName(), 1, "Couldn't get past the first few chapters. The protagonist's voice was irritating, and the constant scientific explanations bogged down the story.");

        // add the reviews to the book
        Book b5 = new Book("Project Hail Mary","Andy Weir","978-0593135204",18*3.75,50);
        b5.addReview(r1);
        b5.addReview(r2);
        b5.addReview(r3);
        b5.addReview(r4);
        b5.addReview(r5);


        // create 5 movies
        Movie mov1 = new Movie("The Chronos Key","Dr. Aris Thorne",19.99*3.75,135);
        Movie mov2 = new Movie("Whispers in the Nebula","Seraphina Vane",14.99*3.75,110);
        Movie mov3 = new Movie("The Emerald Labyrinth","Marcus Max Orion",24.99*3.75,150);
        Movie mov4 = new Movie("Silicon Echoes","Kira Thorne",12.99*3.75,100);
        Movie mov5 = new Movie("The Last Starfall","Elias Vance",29.99*3.75,125);

        // create 5 music items, based on Gemini Ai, the author is different from the artist for music
        Music mu1 = new Music("Starlight Serenade", "Melody Weaver", 12.99*3.75, "The Lumina Ensemble");
        Music mu2 = new Music("Echoes of Tomorrow", "Lyricist X & Beat Master B", 1.29*3.75, "Nova Bloom");
        Music mu3 = new Music("The Groove Collective", "Jam Session Crew", 7.99*3.75, "Funk Propulsion");
        Music mu4 = new Music("A Symphony of Seasons", "Dr. Elias Vance", 18.5*3.75, "The Grand Epoch Orchestra");
        Music mu5 = new Music("Midnight Reverie", "Luna Sol", 27.99*3.75, "Luna Sol");

        // create 5 novels
        Novel n1 = new Novel("Dune","Frank Herbert","978-0441172719",15.99*3.75,43,"Science Fiction");
        Novel n2 = new Novel("The Midnight Library","Matt Haig","978-0143135504",17*3.75,38,"Fantasy");
        Novel n3 = new Novel("Where the Crawdads Sing","Delia Owens","978-0735219090",18*3.75,80,"Mystery");
        Novel n4 = new Novel("The Henna Artist","Alka Joshi","978-1982150371",16.99*3.75,24,"Historical");
        Novel n5 = new Novel("The Martian","Andy Weir","978-0553418026",16*3.75,60,"Science Fiction");

        // create 5 academic books
        AcademicBook ab1 = new AcademicBook("Thinking, Fast and Slow","Daniel Kahneman","978-0374533557",18*3.75,63,"Psychology");
        AcademicBook ab2 = new AcademicBook("Sapiens: A Brief History of Humankind","Yuval Noah Harari","978-0062316097",20*3.75,150,"History");
        AcademicBook ab3 = new AcademicBook("The Structure of Scientific Revolutions","Thomas S. Kuhn","978-0226458083",17*3.75,63,"Philosophy");
        AcademicBook ab4 = new AcademicBook("Discipline and Punish: The Birth of the Prison","Michel Foucault","978-0679752554",19*3.75,58,"Sociology");
        AcademicBook ab5 = new AcademicBook("Principles of Economics","N. Gregory Mankiw","978-1337096898",250*3.75,94,"Economics");

        // create the store and add all media items to it
        Store store = new Store(new User[]{u1, u2, u3, u4, u5}
                , new Media[]{b1,b2,b3,b4,b5,mov1,mov2,mov3,mov4,mov5,
                mu1,mu2,mu3,mu4,mu5,n1,n2,n3,n4,n5,ab1,ab2,ab3,ab4,ab5});
    }
}
