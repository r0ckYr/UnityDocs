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

6. **Change Password:**
    - Endpoint: `/api/user/change-password`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "oldPassword": "currentPass", "newPassword": "newPass123" }`

7. **Reset Password (Forgot Password):**
    - Endpoint: `/api/user/reset-password`
    - Method: POST
    - Request Body: `{ "email": "user@example.com" }`

### Document Management:

8. **Create a Document:**
   - Endpoint: `/api/documents`
   - Method: POST
   - Headers: Authorization Bearer Token
   - Request Body: `{ "name": "Document Name", "content": "Initial content of the document" }`

9. **Get All User Documents:**
   - Endpoint: `/api/documents`
   - Method: GET
   - Headers: Authorization Bearer Token

10. **Get Document by ID:**
    - Endpoint: `/api/documents/{documentId}`
    - Method: GET
    - Headers: Authorization Bearer Token

11. **Update Document:**
    - Endpoint: `/api/documents/{documentId}`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "content": "Updated content of the document" }`

12. **Delete Document:**
    - Endpoint: `/api/documents/{documentId}`
    - Method: DELETE
    - Headers: Authorization Bearer Token

### Collaboration and Sharing:

13. **Invite User to Collaborate:**
    - Endpoint: `/api/documents/{documentId}/invite`
    - Method: POST
    - Headers: Authorization Bearer Token
    - Request Body: `{ "email": "collaborator@example.com", "permission": "read/write" }`

14. **Accept/Decline Collaboration Invitation:**
    - Endpoint: `/api/invitations/{invitationId}`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "status": "accepted" }`

### Version Control:

15. **Create Document Version:**
    - Endpoint: `/api/documents/{documentId}/versions`
    - Method: POST
    - Headers: Authorization Bearer Token

16. **Get All Versions of a Document:**
    - Endpoint: `/api/documents/{documentId}/versions`
    - Method: GET
    - Headers: Authorization Bearer Token

17. **Get Specific Version of a Document:**
    - Endpoint: `/api/documents/{documentId}/versions/{versionNumber}`
    - Method: GET
    - Headers: Authorization Bearer Token

18. **Switch Document Version:**
    - Endpoint: `/api/documents/{documentId}/versions/{versionNumber}/switch`
    - Method: PUT
    - Headers: Authorization Bearer Token

### Real-time Collaboration (Websockets):

19. **WebSocket Connection:**
    - Establish a WebSocket connection for real-time collaboration.

### File Upload (Images):

20. **Upload Image:**
    - Endpoint: `/api/images/upload`
    - Method: POST
    - Headers: Authorization Bearer Token
    - Form Data: `{ "file": [Image File] }`

### Other Options (URL Embed, Video, Public Link Sharing):

21. **Embed URL in Document:**
    - Endpoint: `/api/documents/{documentId}/embed-url`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "url": "https://example.com" }`

22. **Embed Video in Document:**
    - Endpoint: `/api/documents/{documentId}/embed-video`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "videoUrl": "https://youtube.com/watch?v=videoId" }`

23. **Generate Public Link for Document:**
    - Endpoint: `/api/documents/{documentId}/public-link`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "isPublic": true }`

### Search and Filtering:

24. **Search Documents:**
    - Endpoint: `/api/documents/search`
    - Method: GET
    - Headers: Authorization Bearer Token
    - Query Parameters: `{ "query": "search term" }`

### Notifications:

25. **Get User Notifications:**
    - Endpoint: `/api/notifications`
    - Method: GET
    - Headers: Authorization Bearer Token

26. **Mark Notification as Read:**
    - Endpoint: `/api/notifications/{notificationId}`
    - Method: PUT
    - Headers: Authorization Bearer Token
    - Request Body: `{ "status": "read" }`

### User Management (Admin Functionality):

27. **Get All Users:**
    - Endpoint: `/api/users`
    - Method: GET
    - Headers: Authorization Bearer Token (Admin)

28. **Update User Role:**
    - Endpoint: `/api/users/{userId}/role`
    - Method: PUT
    - Headers: Authorization Bearer Token (Admin)
    - Request Body: `{ "role": "admin" }`

### Analytics:

29. **Track Document Views:**
    - Endpoint: `/api/documents/{documentId}/track-view`
    - Method: POST
    - Headers: Authorization Bearer Token

### Export/Import:

30. **Export Document to PDF:**
    - Endpoint: `/api/documents/{documentId}/export/pdf`
    - Method: GET
    - Headers: Authorization Bearer Token

31. **Import Document from PDF:**
    - Endpoint: `/api/documents/import/pdf`
    - Method: POST
    - Headers: Authorization Bearer Token
    - Request Body: `{ "pdfUrl": "https://example.com/document.pdf" }`

