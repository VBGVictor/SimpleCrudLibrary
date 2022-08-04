package com.exampleLybrari.CrudLybrari;

import com.Entity.Book;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;
import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;

import java.util.Properties;

public class LibaryDescriptor extends AbstractTypeDescriptor<Book> {

    protected LibaryDescriptor() {
        super(Book.class, new ImmutableMutabilityPlan<>());
    }

    @Override
    public String toString(Book value) {
        return null;
    }

    @Override
    public Book fromString(String string) {
        return null;
    }

    @Override
    public <X> X unwrap(Book value, Class<X> type, WrapperOptions options) {
        return null;
    }

    @Override
    public <X> Book wrap(X value, WrapperOptions options) {
        return null;
    }

    @Override
    public SqlTypeDescriptor getJdbcRecommendedSqlType(JdbcRecommendedSqlTypeMappingContext context) {
        return null;
    }


}
