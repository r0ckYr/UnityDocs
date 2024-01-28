### User Authentication and Profile:

1. **User Registration:**
   - Endpoint: `/api/register`
   - Method: POST
   - Request Body: `{ "name": "John Doe", "email": "john@example.com", "password": "password123" }`

2. **User Login:**
   - Endpoint: `/api/login`
   - Method: POST
   - Request Body: `{ "email": "john@example.com", "password": "password123" }`

3. **User Logout:**
   - Endpoint: `/api/logout`
   - Method: POST

4. **Get User Profile:**
   - Endpoint: `/api/user/profile`
   - Method: GET
   - Headers: Authorization Bearer Token

5. **Update User Profile:**
   - Endpoint: `/api/user/profile`
   - Method: PUT
   - Headers: Authorization Bearer Token
   - Request Body: `{ "name": "Updated Name", "email": "updated@example.com" }`

### Settings:

30. **User Preferences:**
    - Endpoint: `/api/user/preferences`
    - Method: GET
    - Headers: Authorization Bearer Token
    - Request Body: `{ "theme": "light", "notifications": true }`

31. **Update User Preferences:**
    - Endpoint: `/api/user/preferences`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "theme": "dark", "notifications": false }`

### Security:

32. **Change Password:**
    - Endpoint: `/api/user/change-password`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "oldPassword": "currentPass", "newPassword": "newPass123" }`

33. **Reset Password (Forgot Password):**
    - Endpoint: `/api/user/reset-password`
    - Method: POST
    - Request Body: `{ "email": "user@example.com" }`

### Document Management:

6. **Create a Document:**
   - Endpoint: `/api/documents`
   - Method: POST
   - Headers: Authorization Bearer Token
   - Request Body: `{ "name": "Document Name", "content": "Initial content of the document" }`

7. **Get All User Documents:**
   - Endpoint: `/api/documents`
   - Method: GET
   - Headers: Authorization Bearer Token

8. **Get Document by ID:**
   - Endpoint: `/api/documents/{documentId}`
   - Method: GET
   - Headers: Authorization Bearer Token

9. **Update Document:**
   - Endpoint: `/api/documents/{documentId}`
   - Method: PUT
   - Headers: Authorization Bearer Token
   - Request Body: `{ "content": "Updated content of the document" }`

10. **Delete Document:**
    - Endpoint: `/api/documents/{documentId}`
    - Method: DELETE
    - Headers: Authorization Bearer Token

### Collaboration and Sharing:

11. **Invite User to Collaborate:**
    - Endpoint: `/api/documents/{documentId}/invite`
    - Method: POST
    - Headers: Authorization Bearer Token
    - Request Body: `{ "email": "collaborator@example.com", "permission": "read/write" }`

12. **Accept/Decline Collaboration Invitation:**
    - Endpoint: `/api/invitations/{invitationId}`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "status": "accepted" }`

### Version Control:

13. **Create Document Version:**
    - Endpoint: `/api/documents/{documentId}/versions`
    - Method: POST
    - Headers: Authorization Bearer Token

14. **Get All Versions of a Document:**
    - Endpoint: `/api/documents/{documentId}/versions`
    - Method: GET
    - Headers: Authorization Bearer Token

15. **Get Specific Version of a Document:**
    - Endpoint: `/api/documents/{documentId}/versions/{versionNumber}`
    - Method: GET
    - Headers: Authorization Bearer Token

16. **Switch Document Version:**
    - Endpoint: `/api/documents/{documentId}/versions/{versionNumber}/switch`
    - Method: PUT
    - Headers: Authorization Bearer Token

### Real-time Collaboration (Websockets):

17. **WebSocket Connection:**
    - Establish a WebSocket connection for real-time collaboration.

### File Upload (Images):

18. **Upload Image:**
    - Endpoint: `/api/images/upload`
    - Method: POST
    - Headers: Authorization Bearer Token
    - Form Data: `{ "file": [Image File] }`

### Other Options (URL Embed, Video, Public Link Sharing):

19. **Embed URL in Document:**
    - Endpoint: `/api/documents/{documentId}/embed-url`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "url": "https://example.com" }`

20. **Embed Video in Document:**
    - Endpoint: `/api/documents/{documentId}/embed-video`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "videoUrl": "https://youtube.com/watch?v=videoId" }`

21. **Generate Public Link for Document:**
    - Endpoint: `/api/documents/{documentId}/public-link`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "isPublic": true }`

### Search and Filtering:

22. **Search Documents:**
    - Endpoint: `/api/documents/search`
    - Method: GET
    - Headers: Authorization Bearer Token
    - Query Parameters: `{ "query": "search term" }`

### Notifications:

23. **Get User Notifications:**
    - Endpoint: `/api/notifications`
    - Method: GET
    - Headers: Authorization Bearer Token

24. **Mark Notification as Read:**
    - Endpoint: `/api/notifications/{notificationId}`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "status": "read" }`

### User Management (Admin Functionality):

25. **Get All Users:**
    - Endpoint: `/api/users`
    - Method: GET
    - Headers: Authorization Bearer Token (Admin)

26. **Update User Role:**
    - Endpoint: `/api/users/{userId}/role`
    - Method: PUT
    - Headers: Authorization Bearer Token (Admin)
    - Request Body: `{ "role": "admin" }`

### Analytics:

27. **Track Document Views:**
    - Endpoint: `/api/documents/{documentId}/track-view`
    - Method: POST
    - Headers: Authorization Bearer Token

### Export/Import:

28. **Export Document to PDF:**
    - Endpoint: `/api/documents/{documentId}/export/pdf`
    - Method: GET
    - Headers: Authorization Bearer Token

29. **Import Document from PDF:**
    - Endpoint: `/api/documents/import/pdf`
    - Method: POST
    - Headers: Authorization Bearer Token
    - Request Body: `{ "pdfUrl": "https://example.com/document.pdf" }`


