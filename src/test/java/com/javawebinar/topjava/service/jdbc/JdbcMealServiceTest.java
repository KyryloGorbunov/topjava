package com.javawebinar.topjava.service.jdbc;

import org.springframework.test.context.ActiveProfiles;
import com.javawebinar.topjava.service.AbstractMealServiceTest;

import static com.javawebinar.topjava.Profiles.JDBC;

@ActiveProfiles(JDBC)
class JdbcMealServiceTest extends AbstractMealServiceTest {
}