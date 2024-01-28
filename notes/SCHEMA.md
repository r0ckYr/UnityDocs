## Schemas:

### User:
- id
- name
- email
- password
- created_at
- updated_at
- role

### Document:
- id
- name
- latest_version
- owner -> user.id
- file_path (data saved in markdown)
- is_public

### UserDocument:
- user.id
- document.id
- permission (R/W)
- created_at
- updated_at

### Notification:
- id
- title
- content
- created_at
- updated_at
- status (read/unread)

### UserNotification:
- user.id
- notification.id
- viewed_at
