## Santander dev week

```mermaid
classDiagram
    class User {
        - String nome
        - Account account
        - Post post
        - Commission commission
    }
    
    class Account {
        - int followers
    }
    
    class Post {
        - int likes
        - int reposts
    }
    
    class Commission {
        - int queue
        - int price
    }
    
    User "1"*-- "1" Account : contains
    User "1"*-- "n" Post : contains
    User "1"*-- "n" Commission : contains
```
