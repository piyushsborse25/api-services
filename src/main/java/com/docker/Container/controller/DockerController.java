package com.docker.Container.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping(path = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
	public String Welcome() {
		
		return """
            <!DOCTYPE html>
            <html lang="en">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Welcome to MovieVerse</title>
                <style>
                    body {
                        margin: 0;
                        font-family: Arial, sans-serif;
                        background-color: #121212;
                        color: white;
                        text-align: center;
                    }
                    header {
                        background-color: #1c1c1c;
                        padding: 20px;
                        position: sticky;
                        top: 0;
                        z-index: 10;
                    }
                    .logo {
                        font-size: 2.5rem;
                        font-weight: bold;
                        color: #ffcc00;
                    }
                    .container {
                        padding: 30px 20px;
                    }
                    .tagline {
                        margin-top: 10px;
                        font-size: 1.2rem;
                        color: #dddddd;
                    }
                    .button {
                        display: inline-block;
                        margin: 20px 10px;
                        padding: 10px 20px;
                        font-size: 1rem;
                        color: white;
                        background-color: #ff6600;
                        border: none;
                        border-radius: 5px;
                        cursor: pointer;
                        text-decoration: none;
                    }
                    .button:hover {
                        background-color: #e65c00;
                    }
                    .about-section, .popular-movies-section {
                        margin: 50px 20px;
                    }
                    .section-title {
                        font-size: 1.5rem;
                        margin-bottom: 20px;
                        text-transform: uppercase;
                        color: #ffcc00;
                    }
                    .movie-grid {
                        display: flex;
                        justify-content: center;
                        gap: 20px;
                        flex-wrap: wrap;
                    }
                    .movie-card {
                        background: #1e2a38;
                        border-radius: 10px;
                        padding: 15px;
                        text-align: center;
                        width: 200px;
                    }
                    .movie-card img {
                        width: 100%;
                        border-radius: 10px;
                    }
                    .movie-card h3 {
                        font-size: 1rem;
                        margin: 10px 0;
                        color: #ffcc00;
                    }
                    footer {
                        background-color: #1c1c1c;
                        padding: 20px;
                        margin-top: 30px;
                    }
                    footer p {
                        margin: 0;
                        font-size: 0.9rem;
                        color: #aaaaaa;
                    }
                </style>
            </head>
            <body>
                <header>
                    <div class="logo">🎬 MovieVerse</div>
                </header>
                <div class="container">
                    <h1>Welcome to MovieVerse</h1>
                    <p class="tagline">Your ultimate destination for movie entertainment!</p>
                    <a href="#" class="button">Explore Movies</a>
                    <a href="#" class="button">Sign Up</a>
                </div>
                <div class="about-section">
                    <h2 class="section-title">About Us</h2>
                    <p>MovieVerse is your gateway to the world of cinema. Discover the latest releases, revisit timeless classics, and explore curated lists of the most popular movies of all time!</p>
                </div>
                <div class="popular-movies-section">
                    <h2 class="section-title">Popular Movies</h2>
                    <div class="movie-grid">
                        <div class="movie-card">
                            <img src="https://via.placeholder.com/200x300" alt="Movie 1">
                            <h3>Movie Title 1</h3>
                        </div>
                        <div class="movie-card">
                            <img src="https://via.placeholder.com/200x300" alt="Movie 2">
                            <h3>Movie Title 2</h3>
                        </div>
                        <div class="movie-card">
                            <img src="https://via.placeholder.com/200x300" alt="Movie 3">
                            <h3>Movie Title 3</h3>
                        </div>
                    </div>
                </div>
                <footer>
                    <p>&copy; 2024 MovieVerse. All Rights Reserved.</p>
                </footer>
            </body>
            </html>
            """;
	}

}
