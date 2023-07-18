package com.vaibhav.banksystem.mapper.usermapper;

import com.vaibhav.banksystem.dto.user.UserDto;
import com.vaibhav.banksystem.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
  User userDtoToUser(UserDto userDto);

  UserDto userToUserDto(User user);
}
