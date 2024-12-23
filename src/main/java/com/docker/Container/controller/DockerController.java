package com.docker.Container.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	
	@GetMapping(path = "/welcome", produces = MediaType.TEXT_HTML_VALUE)
	public String Welcome() {
		
		return "<!DOCTYPE html>\r\n"
				+ "<html lang=\"en\">\r\n"
				+ "<head>\r\n"
				+ "    <meta charset=\"UTF-8\">\r\n"
				+ "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n"
				+ "    <title>Welcome to Docker Container</title>\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "            background-color: #f4f4f9;\r\n"
				+ "            color: #333;\r\n"
				+ "        }\r\n"
				+ "        header {\r\n"
				+ "            background-color: #007acc;\r\n"
				+ "            color: #fff;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "        section {\r\n"
				+ "            padding: 20px;\r\n"
				+ "        }\r\n"
				+ "        .container-info {\r\n"
				+ "            background: #fff;\r\n"
				+ "            border: 1px solid #ddd;\r\n"
				+ "            border-radius: 8px;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            max-width: 600px;\r\n"
				+ "            margin: 20px auto;\r\n"
				+ "            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);\r\n"
				+ "        }\r\n"
				+ "        .container-info h2 {\r\n"
				+ "            color: #007acc;\r\n"
				+ "        }\r\n"
				+ "        .container-info ul {\r\n"
				+ "            list-style-type: none;\r\n"
				+ "            padding: 0;\r\n"
				+ "        }\r\n"
				+ "        .container-info li {\r\n"
				+ "            padding: 10px 0;\r\n"
				+ "            border-bottom: 1px solid #ddd;\r\n"
				+ "        }\r\n"
				+ "        .container-info li:last-child {\r\n"
				+ "            border-bottom: none;\r\n"
				+ "        }\r\n"
				+ "        footer {\r\n"
				+ "            text-align: center;\r\n"
				+ "            padding: 10px;\r\n"
				+ "            background-color: #007acc;\r\n"
				+ "            color: #fff;\r\n"
				+ "            position: fixed;\r\n"
				+ "            bottom: 0;\r\n"
				+ "            width: 100%;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <header>\r\n"
				+ "        <h1>Welcome to Docker Container</h1>\r\n"
				+ "    </header>\r\n"
				+ "    <section>\r\n"
				+ "        <div class=\"container-info\">\r\n"
				+ "            <h2>Docker Container Details</h2>\r\n"
				+ "            <ul>\r\n"
				+ "                <li><strong>Container Name:</strong> my_docker_app</li>\r\n"
				+ "                <li><strong>Container ID:</strong> 123abc456def</li>\r\n"
				+ "                <li><strong>Image Name:</strong> my-app-image:latest</li>\r\n"
				+ "                <li><strong>Ports:</strong> 8080:80</li>\r\n"
				+ "                <li><strong>Status:</strong> Running</li>\r\n"
				+ "                <li><strong>Created At:</strong> 2024-12-21 12:34:56</li>\r\n"
				+ "            </ul>\r\n"
				+ "        </div>\r\n"
				+ "    </section>\r\n"
				+ "    <footer>\r\n"
				+ "        <p>&copy; 2024 Dockerized App. All Rights Reserved.</p>\r\n"
				+ "    </footer>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+ "";
	}

}
