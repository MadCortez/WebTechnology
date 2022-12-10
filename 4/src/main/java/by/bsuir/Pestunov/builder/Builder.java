package by.bsuir.Pestunov.builder;

import by.bsuir.Pestunov.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
