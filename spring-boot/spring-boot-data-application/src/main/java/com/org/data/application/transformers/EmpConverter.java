package com.org.data.application.transformers;

import com.org.data.application.dto.EmpDto;
import com.org.data.application.dto.EmpWrpDto;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class EmpConverter {

    public static EmpWrpDto convertToEmpDtoUsingJDBCStyle(List<Object[]> rows) {
        EmpWrpDto empWrpDto = new EmpWrpDto();
        if (!CollectionUtils.isEmpty(rows)) {
            Object[] firstRow = rows.get(0);
            empWrpDto.setEmpDtos(new ArrayList<>());
            for (Object[] row : rows) {
                empWrpDto.getEmpDtos().add(new EmpDto().setId((Integer) row[0]).setFirstName(row[1].toString())
                        .setMiddleName(row[2].toString()).setLastName(row[3].toString()));
            }
        }
        return empWrpDto;
    }
}
