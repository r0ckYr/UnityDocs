## Requirements:
- User
- Document
- Sharing
- Version Control
- Continuous Changing?
- Convert to PDF?
- Host Online?

## Basic Schemas:

### User:
- id
- name
- email

### Document:
- id
- name
- latest_version
- owner -> user.id
- file_path (data saved in markdown)

### UserDocument:
- user.id
- document.id
- permission (R/W)

### Notification:
- id
- title
- content

### UserNotification:
- user.id
- notification.id

## Steps:

1. **Create user and implement JWT authentication**
2. **Full web app with user profile page**
   - Change password, username, email, login, register
3. **Front-end markdown editor**
4. **Save the document text in a file and create document entity in the database**
5. **One user can create, save, and edit documents; only owner can delete document (sharing is not implemented yet)**
6. **Add invite user option**
   - Multiple users can change a single document
   - Notification will be given in the app
   - Sharing using email
7. **When a user clicks on save, the new document data is saved in the database (not continuous sharing yet)**
8. **Add option to save different versions of the document**
   - (1.0, 1.1, ..., 1.9, 2.1, ..., 2.9, 3.0)
   - Increase version in continuous order
   - Not automatically save; a button to define a new version
   - Base version (1.0)
   - Option to switch versions using dropdown
   - Different markdown file for each version
9. **Implement websockets for continuous sharing**
10. **Proper way to store data with continuous sharing**
11. **Image upload option**
   - Save image in a cloud bucket
   - Use markdown URL embed
12. **Other options**
   - URL embed
   - Video
   - Public link sharing




## API
   Documentation can be found [here](notes/API_ROUTES.md)


## SCHEMA
   Database [schema](notes/SCHEMA.md)
