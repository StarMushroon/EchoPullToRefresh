package com.xiao.echopulltorefresh;

import java.util.List;

/**
 * Created by StarMushroom on 2017/4/8.
 */

public class Data {



    private List<段子Bean> 段子;

    public List<段子Bean> get段子() {
        return 段子;
    }

    public void set段子(List<段子Bean> 段子) {
        this.段子 = 段子;
    }

    public static class 段子Bean {
        /**
         * adtype : 0
         * boardid : comment_bbs
         * clkNum : 0
         * digest : 今天去精神病院做义工回来，路过菜市场，买了点菜，最后发现钱不够，我对小贩说：“师傅，我从精神病医院出来的急，钱没带够，你看能不能。。。”小贩一听傻眼了：“没事，不就差两块钱吗，不要了，我说大兄弟啊，你恢复的不错，可不能受刺激！”我。。。
         * docid : CHE118VS900118VT
         * downTimes : 60
         * imgType : 0
         * imgsum : 0
         * picCount : 0
         * program : HY
         * prompt : 成功为您推荐20条新内容
         * recNews : 0
         * recType : 0
         * refreshPrompt : 0
         * replyCount : 1
         * replyid : CHE118VS900118VT
         * source : 捧腹网
         * title : 今天去精神病院做义工回来
         * upTimes : 390
         */

        private int adtype;
        private String boardid;
        private int clkNum;
        private String digest;
        private String docid;
        private int downTimes;
        private int imgType;
        private int imgsum;
        private int picCount;
        private String program;
        private String prompt;
        private int recNews;
        private int recType;
        private int refreshPrompt;
        private int replyCount;
        private String replyid;
        private String source;
        private String title;
        private int upTimes;

        public int getAdtype() {
            return adtype;
        }

        public void setAdtype(int adtype) {
            this.adtype = adtype;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public int getClkNum() {
            return clkNum;
        }

        public void setClkNum(int clkNum) {
            this.clkNum = clkNum;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public int getDownTimes() {
            return downTimes;
        }

        public void setDownTimes(int downTimes) {
            this.downTimes = downTimes;
        }

        public int getImgType() {
            return imgType;
        }

        public void setImgType(int imgType) {
            this.imgType = imgType;
        }

        public int getImgsum() {
            return imgsum;
        }

        public void setImgsum(int imgsum) {
            this.imgsum = imgsum;
        }

        public int getPicCount() {
            return picCount;
        }

        public void setPicCount(int picCount) {
            this.picCount = picCount;
        }

        public String getProgram() {
            return program;
        }

        public void setProgram(String program) {
            this.program = program;
        }

        public String getPrompt() {
            return prompt;
        }

        public void setPrompt(String prompt) {
            this.prompt = prompt;
        }

        public int getRecNews() {
            return recNews;
        }

        public void setRecNews(int recNews) {
            this.recNews = recNews;
        }

        public int getRecType() {
            return recType;
        }

        public void setRecType(int recType) {
            this.recType = recType;
        }

        public int getRefreshPrompt() {
            return refreshPrompt;
        }

        public void setRefreshPrompt(int refreshPrompt) {
            this.refreshPrompt = refreshPrompt;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public String getReplyid() {
            return replyid;
        }

        public void setReplyid(String replyid) {
            this.replyid = replyid;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getUpTimes() {
            return upTimes;
        }

        public void setUpTimes(int upTimes) {
            this.upTimes = upTimes;
        }
    }
}
