package com.javawebinar.topjava.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import com.javawebinar.topjava.service.AbstractUserServiceTest;

import static com.javawebinar.topjava.Profiles.JDBC;

@ActiveProfiles(JDBC)
class JdbcUserServiceTest extends AbstractUserServiceTest {
}