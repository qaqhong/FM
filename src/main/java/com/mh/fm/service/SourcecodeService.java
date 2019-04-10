package com.mh.fm.service;

import com.mh.fm.po.Sourcecodepc;
import com.mh.fm.po.Sourcecodephone;

import java.util.List;

public interface SourcecodeService {
    public List<Sourcecodepc> selectSourcecodepc(Sourcecodepc Sourcecodepc);

    public boolean insertSourcecodepc(Sourcecodepc Sourcecodepc);

    public boolean updateSourcecodepc(Sourcecodepc Sourcecodepc);

    public Sourcecodepc getSourcecodepcId(Sourcecodepc Sourcecodepc);

    public boolean deleteSourcecodepc(Sourcecodepc Sourcecodepc);

    public List<Sourcecodephone> selectSourcecodephone(Sourcecodephone Sourcecodephone);

    public boolean insertSourcecodephone(Sourcecodephone Sourcecodephone);

    public boolean updateSourcecodephone(Sourcecodephone Sourcecodephone);

    public Sourcecodephone getSourcecodephoneId(Sourcecodephone Sourcecodephone);

    public boolean deleteSourcecodephone(Sourcecodephone Sourcecodephone);
}
