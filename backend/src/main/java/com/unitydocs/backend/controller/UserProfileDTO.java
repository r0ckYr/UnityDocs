package com.unitydocs.backend.controller;

import com.unitydocs.backend.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class UserProfileDTO {

    private int id;
    private String name;
    private String email;
    private String created_at;
    private String updated_at;

    public static UserProfileDTO fromUser(User user) {
        UserProfileDTO userProfileDTO = new UserProfileDTO();
        userProfileDTO.setId(user.getId());
        userProfileDTO.setName(user.getName());
        userProfileDTO.setEmail(user.getEmail());
        userProfileDTO.setCreated_at(user.getCreated_at());
        userProfileDTO.setUpdated_at(user.getUpdated_at());
        return userProfileDTO;
    }

    // Getters and setters
}
