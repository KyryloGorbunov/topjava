package com.javawebinar.topjava.service.jpa;

import org.springframework.test.context.ActiveProfiles;
import com.javawebinar.topjava.service.AbstractUserServiceTest;

import static com.javawebinar.topjava.Profiles.JPA;

@ActiveProfiles(JPA)
class JpaUserServiceTest extends AbstractUserServiceTest {
}