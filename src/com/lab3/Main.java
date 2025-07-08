package com.lab3;

public class Main {
    public static void main(String[] args) {
        // create initial 5 users who have bought and reviewed everything from the store:

        User u1 = new User("Abdullah.Fahad", "abdullah@company.com");
        User u2 = new User("Ahmed.Hamed", "ahmed@company.com");
        User u3 = new User("Ali.Yasser", "ali@company.com");
        User u4 = new User("Mohammed.Raed", "mohammed@company.com");
        User u5 = new User("Rashid.Mohammed", "rashid@company.com");

        // create 5 books: with a list of 5 reviews
        // assuming rating can range from 0 to 5

        // create a list of 5 reviews {Ai generated (not the code, only the input data)}
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


        // add 5 movies
        

    }
}
