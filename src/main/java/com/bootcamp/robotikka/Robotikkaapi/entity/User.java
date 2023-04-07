package com.bootcamp.robotikka.Robotikkaapi.entity;

import com.bootcamp.robotikka.Robotikkaapi.entity.share.FileResourse;
import com.bootcamp.robotikka.Robotikkaapi.entity.share.UserNameResource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
   @Id
   @Column(name = "property_id")
   private String propertyId;
   @Column(name = "contact_number")
   private String contactNumber;
   @Embedded
   private UserNameResource userNameResource;
   @Column(name = "email")
   private String email;
   @Column(name = "password")
   private String password;
   @Column(name = "is_account_expired")
    private boolean isAccountExpired;
   @Column(name = "is_account_non_locked")
   private boolean isAccountNonLocked;
   @Column(name = "is_credentials_non_expired")
   private boolean isCredentialsNonExpired;
   @Column(name = "is_enabled")
   private boolean isEnabled;
   @Column(name = "prefix")
   private String prefix;
   @Embedded
   private FileResourse avatar;
   @OneToMany(mappedBy = "userPropertyId",cascade = CascadeType.ALL)
   private List<Orders> orders;

   @OneToMany(mappedBy = "userPropertyId", cascade = CascadeType.ALL)
   private List<LovedProperty> lovedProperties;
//    avatar

    /*    property_id; contact_number; frist_name; last_name; email; password; is_account_expired; is_account_non_locked; is_credentials_non_expired; is_enabled; prefix; avatar*/


}
