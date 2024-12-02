package com.innoshare.service;

import com.innoshare.model.domain.Paper;

import java.util.List;

public interface PaperService {

    List<Paper> listAllPapers();

    Paper getPaperById(int id);
}