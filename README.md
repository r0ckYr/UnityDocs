# Project Overview

This project aims to develop a comprehensive web application for document management and collaboration. It includes features such as user management, document creation and editing, sharing functionality, version control, and conversion to PDF. The application will also provide hosting options for online access.

## Project Requirements
- **User Management:** The system should support user registration, login, and profile management. Users should be able to update their passwords, usernames, and email addresses.
- **Document Management:** Users can create, edit, and delete documents. Documents can be saved in markdown format and stored in the database.
- **Sharing Functionality:** Users can share documents with other users, allowing for collaborative editing. Sharing options include in-app notifications and sharing via email.
- **Version Control:** The system supports versioning for documents, allowing users to track changes and revert to previous versions. Versions are incrementally numbered and can be switched using a dropdown menu.
- **Conversion to PDF:** Users have the option to convert documents to PDF format for easier sharing and printing.
- **Hosting Online:** The application will be hosted online to provide access to users from anywhere with an internet connection.

## Implementation Steps

1. **User Management and JWT Authentication:**
   - Implement user authentication using JWT tokens for secure access to the application.
   - Allow users to register, login, and manage their profiles.
2. **Front-End Markdown Editor:**
   - Develop a user-friendly markdown editor for creating and editing documents.
3. **Saving Document Text in a File and Creating Document Entities in the Database:**
   - Implement functionality to save document text in files and store document entities in the database.
4. **Document Creation, Editing, and Deletion:**
   - Enable users to create, edit, and delete documents.
5. **Adding User Invite Option:**
   - Implement a feature to invite other users to collaborate on documents.
   - Provide in-app notifications for document invitations and sharing updates.
6. **Database Saving on Document Save:**
   - Configure the system to save document changes in the database upon save actions.
7. **Version Control:**
   - Implement version control functionality for documents, allowing users to track changes and revert to previous versions.
8. **Implementation of Websockets for Continuous Sharing:**
   - Integrate Websockets to enable real-time collaboration and sharing updates.
9. **Data Storage Strategy for Continuous Sharing:**
   - Develop a robust data storage strategy to support continuous document sharing and collaboration.
10. **Image Upload Functionality:**
    - Allow users to upload images and embed them in documents.
    - Store images in a cloud bucket for efficient access and management.
11. **Additional Features:**
    - Implement URL embedding, video embedding, and public link sharing for enriched document content and sharing options.

## API Documentation

API documentation can be found [here](notes/API_ROUTES.md).

## Database Schema

Database schema details are available [here](notes/SCHEMA.md).