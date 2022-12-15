package com.maven.easybank.api.DAO;

import java.util.List;

public interface GetDetailsDAO {
public List<?> getDetails(int user_id, Character[] password);
}
