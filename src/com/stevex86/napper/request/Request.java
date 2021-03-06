package com.stevex86.napper.request;

import com.stevex86.napper.http.elements.content.BodyContent;
import com.stevex86.napper.http.elements.content.QueryContent;
import com.stevex86.napper.http.elements.header.Header;
import com.stevex86.napper.http.elements.method.RequestMethod;
import com.stevex86.napper.http.elements.route.Route;

import java.util.HashSet;
import java.util.Set;

public class Request {

    private RequestMethod requestMethod;
    private Set<Header> headers;
    private QueryContent queryContent;
    private BodyContent bodyContent;
    private Route route;

    public Request(Route route, RequestMethod requestMethod) {
        this.requestMethod = requestMethod;
        this.headers = new HashSet<Header>();
        this.route = route;
    }

    public void addHeader(Header header) {
        headers.add(header);
    }

    public void setQueryContent(QueryContent content) {
        queryContent = content;
    }

    public void setBodyContent(BodyContent content) {
        bodyContent = content;
    }

    public void addHeaders(Set<Header> headers) {
        this.headers.addAll(headers);
    }

    public RequestMethod getRequestMethod() {
        return requestMethod;
    }

    public Set<Header> getHeaders() {
        return headers;
    }

    public QueryContent getQueryContent() {
        return queryContent;
    }

    public BodyContent getBodyContent() {
        return bodyContent;
    }

    public Route getRoute() {
        return route;
    }

}
