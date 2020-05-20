package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

/**
 * @author shkstart
 * @date 2020/5/15 - 15:51
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);

}
