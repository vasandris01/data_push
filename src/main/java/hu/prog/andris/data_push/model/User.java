package hu.prog.andris.data_push.model;

import java.util.List;

public record User(String name,String gender,List<String> languages) {
}
